package searching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {
   Map<String, List<Pair>> timeMap ;
    public TimeMap() {
        timeMap = new HashMap<String,List<Pair>>();
    }

    public void set(String key, String value, int timestamp) {
        if(timeMap.get(key)!=null)
        {
            List<Pair> values = timeMap.get(key);
            values.add(new Pair(timestamp,value));
            timeMap.put(key,values);
        }
        else
        {
            List<Pair> values = new ArrayList<>();
            values.add(new Pair(timestamp,value));
            timeMap.put(key,values);
        }
    }

    public String get(String key, int timestamp) {
        List<Pair> values = timeMap.get(key);
        String result = "";
        if(values!=null && values.size()>0)
        {
            int l =0,h= values.size()-1;

            while(l<=h)
            {
                int mid=l+h/2;
                if(timestamp==values.get(mid).getTimestamp())
                    return values.get(mid).getValue();
                if(timestamp>values.get(mid).getTimestamp())
                {
                    //I missed here and though low can always hold value of most recent but next statment caused it to go out of boun
                    //so to save closer timestamp we shld have result stored first then increment
                    result = values.get(l).value;
                    l=mid+1;
                }
                else
                    h=mid-1;
                }

            }


        return result;

    }
    public String getWorked(String key, int timestamp) {
        List<Pair> values = timeMap.getOrDefault(key, new ArrayList<>());
        int left = 0, right = values.size() - 1;
        String result = "";

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (values.get(mid).getTimestamp() <= timestamp) {
                result = values.get(mid).getValue();
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    private class Pair {
        int timestamp;
        String value;

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Pair(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }
}

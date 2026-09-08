class TimeMap {

    HashMap<String, ArrayList<Integer>> time;
    HashMap<String, ArrayList<String>> value;

    public TimeMap() {
        time = new HashMap<>();
        value = new HashMap<>();
    }

    public void set(String key, String val, int timestamp) {

        if (!time.containsKey(key)) {
            time.put(key, new ArrayList<>());
            value.put(key, new ArrayList<>());
        }

        time.get(key).add(timestamp);
        value.get(key).add(val);
    }

    public String get(String key, int timestamp) {

        if (!time.containsKey(key)) {
            return "";
        }

        ArrayList<Integer> list = time.get(key);
        ArrayList<String> values = value.get(key);

        int l = 0;
        int r = list.size() - 1;
        String res = "";

        while (l <= r) {

            int m = l + (r - l) / 2;

            if (list.get(m) <= timestamp) {
                res = values.get(m);
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }

        return res;
    }
}

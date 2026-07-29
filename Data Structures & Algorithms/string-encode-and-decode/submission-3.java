class Solution {

    // Encodes a list of strings into a single string
    public String encode(List<String> strs) {

        StringBuilder sb = new StringBuilder();

        for (String s : strs) {

            // Store the length of the string
            sb.append(s.length());

            // Separator
            sb.append('#');

            // Store the actual string
            sb.append(s);
        }

        return sb.toString();
    }

    // Decodes the encoded string back into the original list
    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            int j = i;

            // Find the '#'
            while (str.charAt(j) != '#') {
                j++;
            }

            // Length of the current string
            int len = Integer.parseInt(str.substring(i, j));

            // Extract the string
            String word = str.substring(j + 1, j + 1 + len);

            list.add(word);

            // Move to the next encoded string
            i = j + 1 + len;
        }

        return list;
    }
}
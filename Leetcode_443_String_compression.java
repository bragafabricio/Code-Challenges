class Solution {
    public int compress(char[] chars) {
        // I will iterate over chars, keeping track of read and write

        int write = 0; // Pointer for where to write in the array
        int read = 0; // Pointer to read through the array

        while (read < chars.length) {
            char currentChar = chars[read]; // Current character
            int start = read; // Start of the current group

            // Move `read` to the end of the group of the current character
            while(read < chars.length && chars[read] == currentChar){
                read++;
            }

            // Write the character
            chars[write] = currentChar;
            write++;

            // Write the count if the group size > 1
            int count = read - start; // Size of the group
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (char c : countStr.toCharArray()) {
                    chars[write] = c;
                    write++;
                }
            }
        }
        return write; // New length of the array
    }
}

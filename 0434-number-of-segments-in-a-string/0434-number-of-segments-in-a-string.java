class Solution {
    public int countSegments(String s) {
        // Agar string khali hai ya sirf spaces hain
        if (s == null || s.trim().isEmpty()) {
            return 0;
        }
        // Trim karke mulyiple spaces par split garenge
        return s.trim().split("\\s+").length;
    }
}
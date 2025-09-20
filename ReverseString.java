class ReverseString {
    public static void main(String[] args) {
        String original = "PrepInsta";
        StringBuilder sb = new StringBuilder(original);
        String reversed = sb.reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}

class Problem {

    public static void main(String args[]) {
        try {
            for(int i = 0; i<(int)(args.length)/2; i++){
                System.out.println(args[2*i]+"="+args[2*i+1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
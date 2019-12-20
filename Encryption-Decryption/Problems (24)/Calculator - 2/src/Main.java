/* Please, do not rename it */
class Problem {

    public static void main(String args[]) {
        try {
            String operator = args[0];
            // write your code here
            int result = 0;

            switch (operator) {
                case "MAX":
                    result = getMaxFromValues(args);
                    break;
                case "MIN":
                    result = getMinFromValues(args);
                    break;
                case "SUM":
                    result = getSumValues(args);
                    break;
                default:
                    break;
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int getMaxFromValues(String[] arr){
        int buff = Integer.parseInt(arr[1]);

        for(int i = 2 ; i<arr.length;i++){
            if (Integer.parseInt(arr[i]) > buff) {
                buff = Integer.parseInt(arr[i]);
            }
        }
        return buff;
    }

    public static int getMinFromValues(String[] arr){
        int buff = Integer.parseInt(arr[1]);

        for(int i = 2 ; i<arr.length;i++){
            if (Integer.parseInt(arr[i]) < buff) {
                buff = Integer.parseInt(arr[i]);
            }
        }
        return buff;
    }

    public static int getSumValues(String[] arr){
        int buff = Integer.parseInt(arr[1]);

        for(int i = 2 ; i<arr.length;i++){
            buff += Integer.parseInt(arr[i]);
        }
        return buff;
    }
}
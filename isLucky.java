boolean isLucky(int n) {
    int sum = 0;
    String num = String.valueOf(n);
    int result[] = new int[num.length()];
    for (int i = 0; i < num.length(); i++){
        result[i] = num.charAt(i);
    }
    for(int i = 0; i < result.length; i++){
        if(i<result.length/2){
            sum +=result[i];
        }
        else
            sum -=result[i];
    }
    if(sum !=0){
        return false;
    }
    return true;

}
int[] sortByHeight(int[] a) {
    for(int i =0; i < a.length; i++){
        for(int j = i; j <a.length; j++){
            if(a[i] == -1 || a[j] == -1){
            a[i] = a[i];
           }
        else {
                if(a[j] < a[i]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
    }
    return a;

}
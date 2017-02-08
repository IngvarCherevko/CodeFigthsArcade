String[] allLongestStrings(String[] inputArray) {
    List<String> list = new ArrayList<>();
    list.add(inputArray[0]);
    for(int i = 1 ; i< inputArray.length; i++){
        if(inputArray[i].length() == list.get(0).length()){
            list.add(inputArray[i]);
        }else if (inputArray[i].length() > list.get(0).length()) {
            list = new ArrayList<String>();
            list.add(inputArray[i]);
        }
    }
    String[] myArray = {};
    myArray = list.toArray(new String[list.size()]);
    return myArray;
}
class Solution {
    public boolean solution(String[] phone_book) {
        
        for(int i=0; i<phone_book.length; i++){          
            for(int j=0; j<phone_book.length ; j++){
                if(i!=j){
                    if(phone_book[j].contains(phone_book[i]) && phone_book[j].substring(0,phone_book[i].length()).equals(phone_book[i]))
                        return false;
                    else if(phone_book[i].contains(phone_book[j]) && phone_book[i].substring(0,phone_book[j].length()).equals(phone_book[j]))
                        return false;
                }
            }
        }
        
        return true;
    }
}

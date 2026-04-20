public class uc6.java{
    public static void main(String[]args){
        StringBuilder nameBuilder = new StringBuilder();
        for(String name : args){
            nameBuilder.append(name).append(", ");
       }
       if(nameBuilder.length() > 0){
        name = nameBuilder.substring(0, nameBuilder.length()-2);
       }
}
}
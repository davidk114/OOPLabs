package Lab8.exercise2;

public class Validator {

    public static boolean isValidRegNo(String regNo){
        boolean isValid = false;
    if(regNo.length() >= 6 || regNo.length() <= 12){

      //  for(int i=0;i > regNo.length();i++){
            if(Character.isDigit(regNo.charAt(0)) && Character.isDigit(regNo.charAt(1))){
                if(regNo.charAt(2) == '-'){
                    
                }else
                    isValid = false;

            }else
                isValid = false;



    }else{
       return isValid;
    }


        return isValid;
    }
}

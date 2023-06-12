public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        char[] charArray = myString.toCharArray();
        //boolean capitalRules = true;
        boolean firstLtrCapital = true;
        boolean allLtrsExceptFirstCapital = true;
        boolean allLtrsExceptFirstAreNotCapital = true;

        if (!Character.isUpperCase(charArray[0])){firstLtrCapital = false;}

        for (int i = 1; i < charArray.length; i++) {
            if (!Character.isLowerCase(charArray[i])){
                    allLtrsExceptFirstAreNotCapital = false;
                }
            else {allLtrsExceptFirstCapital = false;}

        }
        if (firstLtrCapital && allLtrsExceptFirstCapital) {return true;}
        if (!firstLtrCapital && allLtrsExceptFirstAreNotCapital) {return true;}
        if (firstLtrCapital && allLtrsExceptFirstAreNotCapital) {return true;}
        return false;

    } // END public boolean detectCapitalUse() --------------------------------------------------|

} // END public class CILab implements CILabInterface{} -----------------------------------------|


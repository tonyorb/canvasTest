public class TitleManager {

    static String createATitle(String article){
        char[] array = article.toCharArray();
        if (array.length == 0) return "Article is empty";
        if (array.length < 25) return String.valueOf(array);
        boolean trim = false;
        for (int i = 22; i > 0; i--){
            if (!trim){
                if (array[i] == ' '){
                    trim = true;
                }
                continue;
            }
            if ((array[i] >= 97 && array[i] <= 122) || (array[i] >= 65 && array[i] <= 90)){
                array[i + 1] = '.';
                array[i + 2] = '.';
                array[i + 3] = '.';
                return String.valueOf(array, 0 , i + 4);
            }
        }
        if (!trim) return "No spaces in article";
        return "Unable to create a title";
    }
}

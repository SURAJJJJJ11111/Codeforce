	// 131A - cAPS lOCK
 	
//  
import java.util.*;

public class _131A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String result = Character.toUpperCase(word.charAt(0)) + "" + word.substring(1);
        System.out.println(result);

        sc.close();
    }
}
// or 
// import java.util.*;

// public class _131A {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String word = sc.next();
        
//         if (word.equals(word.toUpperCase())) {
//             System.out.println(word.toLowerCase());
//         } else if (
//             Character.isLowerCase(word.charAt(0)) && 
//             word.substring(1).equals(word.substring(1).toUpperCase())
//         ) {
//             System.out.println(
//                 Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase()
//             );
//         } else {
//             System.out.println(word);
//         }

//         sc.close();
//     }
// }\
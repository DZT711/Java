import java.util.regex.Pattern;
import java.util.regex.Matcher;

//regex in Pattern.compile
// Expression	Description
// [abc]	    Find one character from the options between the brackets
// [^abc]	    Find one character NOT between the brackets
// [0-9]	    Find one character from the range 0 to 9

 //bieu thuc chinh quy xu li cac ki tu dac biet
// Metacharacter	Description
// |	            Find a match for any one of the patterns separated by | as in: cat|dog|fish
// .	            Find just one instance of any character
// ^	            Finds a match as the beginning of a string as in: ^Hello
// $	            Finds a match at the end of the string as in: World$
// \d	            Find a digit
// \s	            Find a whitespace character
// \b	            Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
// \ uxxxx	        Find the Unicode character specified by the hexadecimal number xxxx 
//k cach

// Quantifier	Description
// n+	        Matches any string that contains at least one n
// n*	        Matches any string that contains zero or more occurrences of n
// n?	        Matches any string that contains zero or one occurrences of n
// n{x}	    Matches any string that contains a sequence of X n's
// n{x,y}	    Matches any string that contains a sequence of X to Y n's
// n{x,}	    Matches any string that contains a sequence of at least X n's
public class regularExpression {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("huy", Pattern.CASE_INSENSITIVE);//Tạo mẫu tìm kiếm từ "huy" và bỏ qua chữ hoa/chữ thường.
        Matcher m = p.matcher("Nguyen Si Huy");
        boolean found = m.find();//Kiểm tra xem mẫu có xuất hiện trong chuỗi "Nguyen Si Huy" hay không.
        if (found) {
            System.out.println("Found the text");
        } else {
            System.out.println("Did not find the text");
        }

        //Pattern.LITERAL giúp đảm bảo rằng mọi ký tự trong chuỗi mẫu đều được hiểu theo nghĩa đen, tức là không có ký tự đặc biệt nào được xử lý như biểu thức chính quy.
        String text = "Hello? Are you there?";
        Pattern pattern = Pattern.compile("Hello?", Pattern.LITERAL);
        // Bình thường, dấu ? trong RegEx có nghĩa là ký tự trước nó xuất hiện 0 hoặc 1 lần.

        // Nhưng với Pattern.LITERAL, dấu ? sẽ được coi như một ký tự thông thường, không có ý nghĩa đặc biệt.
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Match found!");
        } else {
            System.out.println("Match not found.");
        }

        //Pattern.UNICODE_CASE giúp mở rộng Pattern.CASE_INSENSITIVE, cho phép nó hoạt động với tất cả các ký tự Unicode, thay vì chỉ ASCII.
        String text1 = "Đây là một Ví Dụ về Unicode!";
        Pattern pattern1 = Pattern.compile("^ví dụ", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        //Bình thường, Pattern.CASE_INSENSITIVE chỉ hoạt động với ký tự ASCII (A-Z, a-z).

        // Khi thêm Pattern.UNICODE_CASE, nó sẽ làm việc với tất cả các ký tự Unicode, bao gồm chữ cái có dấu (Đ, Ă, Ê...).

        Matcher matcher1 = pattern1.matcher(text1);

        if (!matcher1.find()) {
            System.out.println("Match found!");
        } else {
            System.out.println("Match not found.");
        }
    }
}

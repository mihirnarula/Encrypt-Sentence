package encrpt;
import java.util.*;
public class Encrpt {

    String wrd;
    int len;
    String newwrd;
    
    Encrpt(){
        wrd = "";
        len = 0;
        newwrd = "";
    }
    
    void acceptword(){
        System.out.print("Enter word in upper case: ");
        Scanner sc = new Scanner(System.in);
        wrd = sc.nextLine();
    }
    
    void freqvowcon(){
        int con = 0; int vow = 0;
        len = wrd.length();
        
        for(int i = 0; i < len; i++){
            char ch = wrd.charAt(i);
            
            if(ch == 'A'){
                newwrd = newwrd + 'E';
                vow++;
            }
            else if(ch == 'E'){
                newwrd = newwrd + 'I';
                vow++;
            }
            else if(ch == 'I'){
                newwrd = newwrd + 'O';
                vow++;
            }
            else if(ch == 'O'){
                newwrd = newwrd + 'U';
                vow++;
            }
            else if(ch == 'U'){
                newwrd = newwrd + 'A';
                vow++;
            }
            else {
                newwrd = newwrd + ch;
                con++;
            }
        }
        System.out.println("Number of vowels: " + vow);
        System.out.println("Number of consonants: " + con);
    }
     void disp(){
         System.out.println("Original word: "+wrd);
         System.out.println("Encrypted word: "+newwrd);
     }       
    
    public static void main(String[] args) {

        Encrpt ob = new Encrpt();
        ob.acceptword();
        ob.freqvowcon();
        ob.disp();
        
    }
    
}

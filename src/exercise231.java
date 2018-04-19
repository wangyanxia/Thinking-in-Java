import java.util.*;

public class exercise231 {
	public static void test(String[] args){
		Stack<Character> expressionStack = new Stack<Character>();
		String expression = "+U+n+c---+e+r+t---+a-+i_+n+t+y---+-+r+u--+l+e+s--";
		for(int i = 0; i < expression.length(); i++){
			Character c = expression.charAt(i);
			switch(c){
			case '+':
			expressionStack.push(expression.charAt(++i));
			break;
			case '-':
			System.out.print(expressionStack.pop());
			break;
			default:
			break;
			}
		}
	}
	

}

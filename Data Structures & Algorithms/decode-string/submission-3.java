class Solution {
    public String decodeString(String s) {
        Stack<String> st=new Stack<>();
	
		String t="";
		int c=0;
		String k="";
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9'){
				c=c*10+(ch-48);
			}
			else if(ch!='['&&ch!=']'){
				t+=ch;
			}
			else if(ch=='['){
				st.push(t);
				st.push(c+"");
				st.push(ch+"");
				t="";
				c=0;
			}
			else{

				while(!st.peek().equals("[")){
					t=st.pop()+t;
				}
				st.pop();
				int num=Integer.parseInt(st.pop());
				StringBuilder sb=new StringBuilder();
				for(int j=1;j<=num;j++){
					sb.append(t);
				}
				st.push(st.pop()+sb.toString());
				t="";
				
				
			}
		}
		String ss="";
		while(st.isEmpty()==false){
			ss=st.pop()+ss;
		}
		ss+=t;
		return ss;

    }
}
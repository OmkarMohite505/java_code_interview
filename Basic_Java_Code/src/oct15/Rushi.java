package oct15;

public class Rushi {

	public static void main(String[] args) {
		String mainStr = "aabcccabba";
		System.out.println(solve(mainStr));
		
	}
	public static int solve(String s){
        StringBuffer sb=new StringBuffer(s.substring(s.length()/2));
        StringBuffer sbs=new StringBuffer();
        sb.append(s.substring(0,s.length()/2));
        while (true) {
            char curr=sb.charAt(0);
            int count=1;
            boolean check=true;
            for(int i=1;i<sb.length();i++){
                if(sb.charAt(i)==curr){
                    count++;
                    if(count==3){
                        sbs=new StringBuffer(sb.substring(0, i-1));
                        sbs.append(sb.substring(i+2,sb.length()));
                        check=false;
                       // i=i-2;
                    }

                }
                else{
                    curr=sb.charAt(i);
                }

            }
            int counter=1;
            char current=sbs.charAt(0);
            for (int i = 0; i < sbs.length(); i++) {
                if(sbs.charAt(i)==current){
                    counter++;
                    if(counter==3){
                        sb=sbs;
                        break;
                    }
                }
                else{
                    counter=1;
                    current=sbs.charAt(i);
                }
                
                
            }
            System.out.println(sbs);
            if(counter<3) break;
            
            //if(check)
            
            
        }
        return sbs.length();

    }

}

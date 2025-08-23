

    public class Max_word {
        public static void main(String[] args) {
                StringBuilder sb=new StringBuilder("java python javascript");
                int start=0;
                String max="";
                int maxlen=0;
                for(int i=0;i<=sb.length();i++)
                {
                    if(i==sb.length()||sb.charAt(i)==' '){
                        int wordlen=i-start;
                        if(wordlen>maxlen){
                            maxlen=wordlen;
                            max=sb.substring(start,i);
                        }
                        start=i+1;
                    }
                }
            System.out.println("Longest word: "+max);
        }
    }

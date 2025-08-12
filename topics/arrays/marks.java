public class marks {
    public static void main(String[] args) {
        int [] arr={80,85,90,75,95};
        int tot=0;
        System.out.print("Marks :");
        for(int i:arr)
        {
            tot+=i;
            System.out.print(i+" ");
        }
        float per= (float) tot /arr.length;
        System.out.println();
        System.out.println("Total:" + tot);
        System.out.println("Percentage:" + per+"%");
        if(per>=80)
        {
            System.out.println("Grade: A");
        }
        else if(per>=50)
        {
            System.out.println("Grade: B");
        }
        else {
            System.out.println("Grade: C");
        }
    }
}

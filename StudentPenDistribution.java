public class StudentPenDistribution {
    public static void main(String[] args) {
        int penDivided = 14;
        int student = 3;
        int nonDistributedPen = penDivided%student;
        int equallyDistributedPen = penDivided-nonDistributedPen;
        
        System.out.print("The Pen Per Student is " + equallyDistributedPen +" and the remaining pen not distributed is " + nonDistributedPen);
    }
}

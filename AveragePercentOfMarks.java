class AveragePercentOfMarks{
    public static void main(String[] args) {
        int mathsMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;
        int totalMarks = mathsMarks+physicsMarks+chemistryMarks;
        
        System.out.println("Average Percentage Marks: " + (totalMarks*100)/300 + "%");
    }
}
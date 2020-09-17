public class VisNuvarendeTid {
    public static void main(String[] args) {
        currenttimemetode();
    }

        public static void currenttimemetode(){
            long totalMilliseconds = System.currentTimeMillis();
            long totalSeconds = totalMilliseconds / 1000;
            long currentSecond = totalSeconds % 60;
            long totalMinutes = totalSeconds / 60;
            long currentMinute = totalMinutes % 60;
            long totalHours = totalMinutes / 60;
            long currentHour = totalHours % 24;

            System.out.println("Nuvarende tid er " + currentHour + " : "
                    + currentMinute + " : " + currentSecond + " GMT");




        }


}

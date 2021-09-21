
import java.time.LocalDateTime;



public class StopWatch {
    private LocalDateTime startTime,endTime;



    public LocalDateTime getStartTime() {
        return this.startTime;
    }

    public LocalDateTime getEndTime() {
        return this.endTime;
    }
    public void start(){
        startTime=LocalDateTime.now();
    }
    public void stop(){
        endTime = LocalDateTime.now();
    }
    public int getElapsedTine(){
        return startTime.getSecond()-endTime.getSecond();
    }
}

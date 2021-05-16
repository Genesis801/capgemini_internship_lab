import java.time.*;

public class CountDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate pdate=LocalDate.of(2021,05,18);
		LocalDate now=LocalDate.now();
		
		Period diff=Period.between(pdate, now);
		System.out.println("Reamaining "+diff.getYears()+" years||"+diff.getMonths()+" Months||"+diff.getDays()+"days");
	}
}

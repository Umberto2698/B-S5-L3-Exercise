package lezione17.enteties;

import lezione17.enums.TableState;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component("table")
@Getter
@ToString
public class Tavolo {
    private int tableNumber = new Random().nextInt(1, 40);
    private int seatNumber = 4;
    private TableState tableState = TableState.OCCUPATO;


    public void setTableState(TableState tableState) {
        this.tableState = tableState;
    }
}

package lezione17.enteties;

import lezione17.enums.TableState;
import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Random;


@Getter
@ToString
public class Tavolo {
    private int tableNumber;
    private int seatNumber = 4;
    private TableState tableState = TableState.OCCUPATO;
public Tavolo(int tableNumber){
    this.tableNumber=tableNumber;
}

    public void setTableState(TableState tableState) {
        this.tableState = tableState;
    }
}

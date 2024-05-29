public class nodevaksin09 {
    vaksinasi09 data;
    nodevaksin09 prev, next;

    nodevaksin09(nodevaksin09 prev, vaksinasi09 data, nodevaksin09 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}

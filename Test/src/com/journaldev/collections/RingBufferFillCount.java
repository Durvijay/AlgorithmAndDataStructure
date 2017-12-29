package com.journaldev.collections;

public class RingBufferFillCount {
    public int[] elements = null;

    private int capacity  = 0;
    private int writePos  = 0;
    private int available = 0;

    public RingBufferFillCount(int capacity) {
        this.capacity = capacity;
        this.elements = new int[capacity];
    }

    public void reset() {
        this.writePos = 0;
        this.available = 0;
    }

    public int capacity() { return this.capacity; }
    public int available(){ return this.available; }

    public int remainingCapacity() {
        return this.capacity - this.available;
    }

    public boolean put(int element){

        if(available < capacity){
            if(writePos >= capacity){
                writePos = 0;
            }
            elements[writePos] = element;
            writePos++;
            available++;
            return true;
        }

        return false;
    }

    public Integer take() {
        if(available == 0){
            return null;
        }
        int nextSlot = writePos - available;
        if(nextSlot < 0){
            nextSlot += capacity;
        }
        int nextObj = elements[nextSlot];
        available--;
        return nextObj;
    }

	public static void main(String[] args) {
		RingBufferFillCount ing=new RingBufferFillCount(6);
		ing.put(5);
		ing.put(6);
		
		System.out.println(ing.take());
		ing.put(8);
		ing.put(9);
		ing.take();
	}

}

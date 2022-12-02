package org.example;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        int N = 20000;
        TrackLinkedListTime List = new TrackLinkedListTime(N);
        TrackTime Track = List;
        String[]valuesList = new String[4];
        valuesList[0] = Track.TableValue(List.trackAddTime(), 16);
        valuesList[1] = Track.TableValue(List.trackRemoveTime(), 16);
        valuesList[2] = Track.TableValue(List.trackGetTime(), 16);
        valuesList[3] = Track.TableValue(List.trackSubListTime(), 16);
        String ListTable = Track.Table(Track.TableValue(N, 20), valuesList);
        System.out.println("Table for LinkedList methods compiling time");
        System.out.println(ListTable);
        System.out.println();

        TrackArrayListTime Array = new TrackArrayListTime(N);
        Track = Array;
        String[]valuesArray = new String[4];
        valuesArray[0] = Track.TableValue(Array.trackAddTime(), 16);
        valuesArray[1] = Track.TableValue(Array.trackRemoveTime(), 16);
        valuesArray[2] = Track.TableValue(Array.trackGetTime(), 16);
        valuesArray[3] = Track.TableValue(Array.trackSubListTime(), 16);
        String ArrayTable = Track.Table(Track.TableValue(N, 20), valuesArray);
        System.out.println("Table for ArrayList methods compiling time");
        System.out.println(ArrayTable);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hu.ziy
 */
public class WorkerDirectory {
    private List<Worker> workerList;
    public WorkerDirectory() {
    
        workerList = new ArrayList<Worker>();
    }

    public void setWorkerList(List<Worker> workerList) {
        this.workerList = workerList;
    }
    
    public List<Worker> getWorkerlist(){
        return workerList;
    }
    
    public Worker addWorker(){
        Worker w = new Worker();
        workerList.add(w);
        return w;
    }
    
    public void removeWorker(Worker w){
        workerList.remove(w);
    }
    
    public Worker searchWorker(String keyword){
        for (Worker worker : workerList) {
            if(worker.getWorkerName().equals(keyword)){
                return worker;
            }
        }
        return null;
    }
}

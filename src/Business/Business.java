/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author hu.ziy
 */
public class Business {
    private WorkerDirectory workerDirectory;
    public Business(){
workerDirectory=new WorkerDirectory();

}

    public WorkerDirectory getWorkerDirectory() {
        return workerDirectory;
    }

    public void setWorkerDirectory(WorkerDirectory workerDirectory) {
        this.workerDirectory = workerDirectory;
    }
    
}

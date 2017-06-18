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
public class Worker {

    public String workerName;
    public String gender;
    public String date;
    public String Id;

    public WageCatalog wageCatolog;

    public Worker() {
    }

    @Override

    public String toString() {
        return workerName;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public WageCatalog getWageCatolog() {
        return wageCatolog;
    }

    public void setWageCatolog(WageCatalog wageCatolog) {
        this.wageCatolog = wageCatolog;
    }

}

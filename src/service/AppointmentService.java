package service;

import java.util.ArrayList;
import model.Appointment;

public class AppointmentService {

    private ArrayList<Appointment> appointments = new ArrayList<>();

    
    public void bookAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment booked successfully!");
    }

    
    public void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }

        for (Appointment appointment : appointments) {
            appointment.displayAppointment();
        }
    }

   
    public boolean cancelAppointment(int appointmentId) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentId() == appointmentId) {
                appointments.remove(appointment);
                return true;
            }
        }
        return false;
    }
}

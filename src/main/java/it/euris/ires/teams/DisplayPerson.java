package it.euris.ires.teams;

import static it.euris.ires.teams.TeamRepository.teamList;

public class DisplayPerson implements TeamManagement {

    @Override
    public void sendCommand(String person) {
        for (Team t : teamList) {
            for (Person p : t.getPersonList()) {
                if (p.getName().equals(person)) {
                    System.out.println(p.toString());
                }
            }
        }
    }


}

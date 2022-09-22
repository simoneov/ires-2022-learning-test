package it.euris.ires.teams;

import static it.euris.ires.teams.TeamRepository.teamList;

public class DisplayTeam implements TeamManagement{

    @Override
    public void sendCommand(String team) {
        for (Team t : teamList) {
            if(t.getName().equals(team)){
                t.getPersonList().forEach(
                        person -> {
                            System.out.println(person.toString());
                        }
                );
            }
        }
    }



}

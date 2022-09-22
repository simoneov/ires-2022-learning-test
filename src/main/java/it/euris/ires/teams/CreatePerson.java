package it.euris.ires.teams;

import static it.euris.ires.teams.TeamRepository.teamList;

public class CreatePerson implements TeamManagement {

    String team;

    public CreatePerson(String team) {
        this.team = team;
    }


    private boolean differentNamePersons(String name) throws EqualNameException {
        for (Team team : teamList) {
            for (Person p : team.getPersonList()) {
                if (name.equals(p.getName()) && this.team.equals(p.getTeam())) {
                    throw new EqualNameException("Can't exist two equal players in the team");
                }
            }
        }
        return true;
    }

    @Override
    public void sendCommand(String name) {

        try {
            if (differentNamePersons(name)) {
                for (Team team : teamList) {
                    if (team.getName().equals(this.team)) {
                        team.addPerson(name);
                    }
                }
            }
        } catch (EqualNameException e) {
            e.getMessage();
        }
    }


}

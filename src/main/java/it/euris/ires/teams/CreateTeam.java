package it.euris.ires.teams;

import static it.euris.ires.teams.TeamRepository.teamList;

public class CreateTeam implements TeamManagement {

    private void differentNameTeams(String name) throws EqualNameException {
        for (Team team : teamList) {
            if (team.getName().equals(name)) {
                throw new EqualNameException("Can't create teams with the same names");
            }
        }
    }

    @Override
    public void sendCommand(String name) {
        try {
            differentNameTeams(name);
        } catch (EqualNameException e) {
            e.getMessage();
        }
        teamList.add(new Team(name));
    }

}

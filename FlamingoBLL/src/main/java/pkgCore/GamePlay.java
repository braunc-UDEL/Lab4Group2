package pkgCore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import pkgEnum.eGameType;

public abstract class GamePlay {

	private eGameType eGameType;
	private HashMap<UUID, Player> hmGamePlayers = new HashMap<UUID,Player>();
	
	public GamePlay(eGameType eGameType)
	{
		super();
		this.eGameType = eGameType;
	}
	
	protected void AddPlayersToGame(ArrayList<Player> Players)
	{
		for(int i = 0; i < Players.size(); i++)
		{
			hmGamePlayers.put(Players.get(i).getPlayerID(),Players.get(i));
		}
	}
	protected void RemovePlayerFromGame(Player p)
	{
		hmGamePlayers.remove(p.getPlayerID());	
	}
	protected Player GetPlayerInGame(Player p)
	{
		hmGamePlayers.get(p.getPlayerID());
		return null;
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectsDAO;

/**
 *
 * @author Martinez
 */
public interface CompetitorDAO {
    
    //Create new Competitor
    public int insertCompetitor(String pCountryCode, String pName,String pGender, String pTrainer,
            boolean pType, int pLodgingId);
    
}

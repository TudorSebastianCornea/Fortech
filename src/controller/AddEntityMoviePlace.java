package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.MovieEntity;
import entities.MoviePlaceEntity;
import model.MovieEntityModel;
import model.MoviePlaceEntityModel;

/**
 * Servlet implementation class AddEntityMoviePlace
 */
@WebServlet("/AddEntityMoviePlace")
public class AddEntityMoviePlace extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEntityMoviePlace() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("idMoviePlaceT");
		String tipe=request.getParameter("timeMoviePlaceT");
		String screen=request.getParameter("screenMovieT");
		String idMovie=request.getParameter("idMovieT");
	
		MoviePlaceEntityModel mpem =new MoviePlaceEntityModel();
		MoviePlaceEntity mpe=new MoviePlaceEntity();
		MovieEntityModel msearch=new MovieEntityModel();
	
		
		
		for(MovieEntity p:msearch.findAll()) {
			if(p.getIdMovie()==Integer.parseInt(idMovie)) {
				mpe.setIdMoviePlace(Integer.parseInt(id));
				mpe.setTimeMoviePlace(tipe);
				mpe.setScreenMoviePlace(screen);
				mpe.setIdMovie(p);
				mpem.create(mpe);
				request.getRequestDispatcher("toMoviePlace.jsp").forward(request, response);;
				break;
			}
		}
		

		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("idMoviePlaceT");
		String tipe=request.getParameter("timeMoviePlaceT");
		String screen=request.getParameter("screenMovieT");
		String idMovie=request.getParameter("idMovieT");
	
		MoviePlaceEntityModel mpem =new MoviePlaceEntityModel();
		MoviePlaceEntity mpe=new MoviePlaceEntity();
		MovieEntityModel msearch=new MovieEntityModel();
	
		
		
		for(MovieEntity p:msearch.findAll()) {
			if(p.getIdMovie()==Integer.parseInt(idMovie)) {
				mpe.setIdMoviePlace(Integer.parseInt(id));
				mpe.setTimeMoviePlace(tipe);
				mpe.setScreenMoviePlace(screen);
				mpe.setIdMovie(p);
				mpem.create(mpe);
				request.getRequestDispatcher("adminpanel.html").forward(request, response);;
				break;
			}
		}

}
}

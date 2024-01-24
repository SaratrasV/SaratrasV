package org.practica.alfredo.Streaming.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.practica.alfredo.Streaming.model.Contenido;
import org.practica.alfredo.Streaming.model.Streaming;

public class ContenidoService {

	private Map<String, Contenido> contenidos = Streaming.getMiContenido();

	public ContenidoService() {
		Contenido miContenido = new Contenido("Contenido - "+(contenidos.size()+1), "Goku", "pelicula", "Un tipo sin cerebro pero con musculos"
				, true, new Date(), "Para adolecentes", 4, "Pais - 1");
		contenidos.put("Contenido - "+(contenidos.size()+1), miContenido);
	}

	public List<Contenido> getAllContenidos() {
		return new ArrayList<Contenido>(contenidos.values());
	}

	public Contenido addContenido(Contenido contenido) {
		contenido.setContenidoId(Long.toString(contenidos.size() + 1L));
		contenidos.put(contenido.getContenidoId(), contenido);
		return contenido;
	}

	public Contenido getContenido(String key) {
		/*
		 * ErrorDataNotFound errorContenido = new ErrorDataNotFound("Not found", 404,
		 * "No hay soluccion."); Response miResponse = Response.status(Status.NOT_FOUND)
		 * .entity(errorContenido) .build();
		 */
		return contenidos.get(key);
	}

	public Contenido updateContenido(Contenido contenido) {
		if (contenido.getContenidoId().isEmpty())
			return null;

		contenidos.put(contenido.getContenidoId(), contenido);
		return contenido;
	}

	public Contenido removeContenido(String key) {
		return contenidos.remove(key);
	}
}

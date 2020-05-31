package br.usjt.movies_init.model.javabeans;

import java.util.Arrays;
/* Jorge Sampaio De Lima RA:81513901*/
public class Populares {
	private int page;
	private Movie[] results;
	private int total_results;
	private int total_pages;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public Movie[] getResults() {
		return results;
	}
	public void setResults(Movie[] results) {
		this.results = results;
	}
	public int getTotal_results() {
		return total_results;
	}
	public void setTotal_results(int total_results) {
		this.total_results = total_results;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	@Override
	public String toString() {
		return "Populares [page=" + page + ", results=" + Arrays.toString(results) + ", total_results=" + total_results
				+ ", total_pages=" + total_pages + "]";
	}

}
/**
 * This package defines the interface between the frontend and the backend of the application.
 * <p>
 * The communication between the frontend and the backend is exclusive done through these two interfaces :
 * <ul>
 * <li>{@link fr.univ.amu.sin4u05.igl.routes.TransportNetwork}, that can list all stations and stops of the transport
 * network, and also find a station by name, and</li>
 * <li>{@link fr.univ.amu.sin4u05.igl.routes.RouteSearch}, that is responsible for the search of routes from one
 * station to another.</li>
 * </ul>
 */
package fr.univ.amu.sin4u05.igl.routes;
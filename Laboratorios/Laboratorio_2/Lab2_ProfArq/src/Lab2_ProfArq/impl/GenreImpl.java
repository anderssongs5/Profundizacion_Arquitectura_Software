/**
 */
package Lab2_ProfArq.impl;

import Lab2_ProfArq.Film;
import Lab2_ProfArq.Genre;
import Lab2_ProfArq.Lab2_ProfArqPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Genre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Lab2_ProfArq.impl.GenreImpl#getGenre <em>Genre</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.GenreImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.GenreImpl#getFilms <em>Films</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GenreImpl extends MinimalEObjectImpl.Container implements Genre {
	/**
	 * The default value of the '{@link #getGenre() <em>Genre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenre()
	 * @generated
	 * @ordered
	 */
	protected static final String GENRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGenre() <em>Genre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenre()
	 * @generated
	 * @ordered
	 */
	protected String genre = GENRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilms() <em>Films</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilms()
	 * @generated
	 * @ordered
	 */
	protected EList<Film> films;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab2_ProfArqPackage.Literals.GENRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenre(String newGenre) {
		String oldGenre = genre;
		genre = newGenre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.GENRE__GENRE, oldGenre, genre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.GENRE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Film> getFilms() {
		if (films == null) {
			films = new EObjectWithInverseResolvingEList.ManyInverse<Film>(Film.class, this, Lab2_ProfArqPackage.GENRE__FILMS, Lab2_ProfArqPackage.FILM__GENRES);
		}
		return films;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Lab2_ProfArqPackage.GENRE__FILMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFilms()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Lab2_ProfArqPackage.GENRE__FILMS:
				return ((InternalEList<?>)getFilms()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Lab2_ProfArqPackage.GENRE__GENRE:
				return getGenre();
			case Lab2_ProfArqPackage.GENRE__DESCRIPTION:
				return getDescription();
			case Lab2_ProfArqPackage.GENRE__FILMS:
				return getFilms();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Lab2_ProfArqPackage.GENRE__GENRE:
				setGenre((String)newValue);
				return;
			case Lab2_ProfArqPackage.GENRE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Lab2_ProfArqPackage.GENRE__FILMS:
				getFilms().clear();
				getFilms().addAll((Collection<? extends Film>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Lab2_ProfArqPackage.GENRE__GENRE:
				setGenre(GENRE_EDEFAULT);
				return;
			case Lab2_ProfArqPackage.GENRE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Lab2_ProfArqPackage.GENRE__FILMS:
				getFilms().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Lab2_ProfArqPackage.GENRE__GENRE:
				return GENRE_EDEFAULT == null ? genre != null : !GENRE_EDEFAULT.equals(genre);
			case Lab2_ProfArqPackage.GENRE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Lab2_ProfArqPackage.GENRE__FILMS:
				return films != null && !films.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (genre: ");
		result.append(genre);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //GenreImpl

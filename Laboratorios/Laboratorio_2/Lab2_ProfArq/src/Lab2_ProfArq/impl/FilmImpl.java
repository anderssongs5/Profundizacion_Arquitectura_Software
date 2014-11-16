/**
 */
package Lab2_ProfArq.impl;

import Lab2_ProfArq.Classification;
import Lab2_ProfArq.Country;
import Lab2_ProfArq.Director;
import Lab2_ProfArq.Film;
import Lab2_ProfArq.Genre;
import Lab2_ProfArq.Lab2_ProfArqPackage;
import java.util.Collection;
import java.util.Date;
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
 * An implementation of the model object '<em><b>Film</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Lab2_ProfArq.impl.FilmImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.FilmImpl#getSynopsis <em>Synopsis</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.FilmImpl#getPseudonym <em>Pseudonym</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.FilmImpl#getImage <em>Image</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.FilmImpl#getDirectors <em>Directors</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.FilmImpl#getGenres <em>Genres</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.FilmImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.FilmImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.FilmImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.FilmImpl#getReleaseDate <em>Release Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilmImpl extends MinimalEObjectImpl.Container implements Film {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSynopsis() <em>Synopsis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynopsis()
	 * @generated
	 * @ordered
	 */
	protected static final String SYNOPSIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSynopsis() <em>Synopsis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynopsis()
	 * @generated
	 * @ordered
	 */
	protected String synopsis = SYNOPSIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPseudonym() <em>Pseudonym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudonym()
	 * @generated
	 * @ordered
	 */
	protected static final String PSEUDONYM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPseudonym() <em>Pseudonym</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPseudonym()
	 * @generated
	 * @ordered
	 */
	protected String pseudonym = PSEUDONYM_EDEFAULT;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected String image = IMAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDirectors() <em>Directors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Director> directors;

	/**
	 * The cached value of the '{@link #getGenres() <em>Genres</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenres()
	 * @generated
	 * @ordered
	 */
	protected EList<Genre> genres;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected Country country;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected Classification classification;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date RELEASE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleaseDate() <em>Release Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseDate()
	 * @generated
	 * @ordered
	 */
	protected Date releaseDate = RELEASE_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab2_ProfArqPackage.Literals.FILM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.FILM__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getReleaseDate() {
		return releaseDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseDate(Date newReleaseDate) {
		Date oldReleaseDate = releaseDate;
		releaseDate = newReleaseDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.FILM__RELEASE_DATE, oldReleaseDate, releaseDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSynopsis() {
		return synopsis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynopsis(String newSynopsis) {
		String oldSynopsis = synopsis;
		synopsis = newSynopsis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.FILM__SYNOPSIS, oldSynopsis, synopsis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPseudonym() {
		return pseudonym;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPseudonym(String newPseudonym) {
		String oldPseudonym = pseudonym;
		pseudonym = newPseudonym;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.FILM__PSEUDONYM, oldPseudonym, pseudonym));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.FILM__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImage() {
		return image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImage(String newImage) {
		String oldImage = image;
		image = newImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.FILM__IMAGE, oldImage, image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Director> getDirectors() {
		if (directors == null) {
			directors = new EObjectWithInverseResolvingEList.ManyInverse<Director>(Director.class, this, Lab2_ProfArqPackage.FILM__DIRECTORS, Lab2_ProfArqPackage.DIRECTOR__MOVIES);
		}
		return directors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Genre> getGenres() {
		if (genres == null) {
			genres = new EObjectWithInverseResolvingEList.ManyInverse<Genre>(Genre.class, this, Lab2_ProfArqPackage.FILM__GENRES, Lab2_ProfArqPackage.GENRE__FILMS);
		}
		return genres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country getCountry() {
		if (country != null && country.eIsProxy()) {
			InternalEObject oldCountry = (InternalEObject)country;
			country = (Country)eResolveProxy(oldCountry);
			if (country != oldCountry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab2_ProfArqPackage.FILM__COUNTRY, oldCountry, country));
			}
		}
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country basicGetCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(Country newCountry) {
		Country oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.FILM__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification getClassification() {
		if (classification != null && classification.eIsProxy()) {
			InternalEObject oldClassification = (InternalEObject)classification;
			classification = (Classification)eResolveProxy(oldClassification);
			if (classification != oldClassification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Lab2_ProfArqPackage.FILM__CLASSIFICATION, oldClassification, classification));
			}
		}
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classification basicGetClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassification(Classification newClassification) {
		Classification oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.FILM__CLASSIFICATION, oldClassification, classification));
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
			case Lab2_ProfArqPackage.FILM__DIRECTORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDirectors()).basicAdd(otherEnd, msgs);
			case Lab2_ProfArqPackage.FILM__GENRES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenres()).basicAdd(otherEnd, msgs);
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
			case Lab2_ProfArqPackage.FILM__DIRECTORS:
				return ((InternalEList<?>)getDirectors()).basicRemove(otherEnd, msgs);
			case Lab2_ProfArqPackage.FILM__GENRES:
				return ((InternalEList<?>)getGenres()).basicRemove(otherEnd, msgs);
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
			case Lab2_ProfArqPackage.FILM__TITLE:
				return getTitle();
			case Lab2_ProfArqPackage.FILM__SYNOPSIS:
				return getSynopsis();
			case Lab2_ProfArqPackage.FILM__PSEUDONYM:
				return getPseudonym();
			case Lab2_ProfArqPackage.FILM__IMAGE:
				return getImage();
			case Lab2_ProfArqPackage.FILM__DIRECTORS:
				return getDirectors();
			case Lab2_ProfArqPackage.FILM__GENRES:
				return getGenres();
			case Lab2_ProfArqPackage.FILM__COUNTRY:
				if (resolve) return getCountry();
				return basicGetCountry();
			case Lab2_ProfArqPackage.FILM__CLASSIFICATION:
				if (resolve) return getClassification();
				return basicGetClassification();
			case Lab2_ProfArqPackage.FILM__DURATION:
				return getDuration();
			case Lab2_ProfArqPackage.FILM__RELEASE_DATE:
				return getReleaseDate();
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
			case Lab2_ProfArqPackage.FILM__TITLE:
				setTitle((String)newValue);
				return;
			case Lab2_ProfArqPackage.FILM__SYNOPSIS:
				setSynopsis((String)newValue);
				return;
			case Lab2_ProfArqPackage.FILM__PSEUDONYM:
				setPseudonym((String)newValue);
				return;
			case Lab2_ProfArqPackage.FILM__IMAGE:
				setImage((String)newValue);
				return;
			case Lab2_ProfArqPackage.FILM__DIRECTORS:
				getDirectors().clear();
				getDirectors().addAll((Collection<? extends Director>)newValue);
				return;
			case Lab2_ProfArqPackage.FILM__GENRES:
				getGenres().clear();
				getGenres().addAll((Collection<? extends Genre>)newValue);
				return;
			case Lab2_ProfArqPackage.FILM__COUNTRY:
				setCountry((Country)newValue);
				return;
			case Lab2_ProfArqPackage.FILM__CLASSIFICATION:
				setClassification((Classification)newValue);
				return;
			case Lab2_ProfArqPackage.FILM__DURATION:
				setDuration((Integer)newValue);
				return;
			case Lab2_ProfArqPackage.FILM__RELEASE_DATE:
				setReleaseDate((Date)newValue);
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
			case Lab2_ProfArqPackage.FILM__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Lab2_ProfArqPackage.FILM__SYNOPSIS:
				setSynopsis(SYNOPSIS_EDEFAULT);
				return;
			case Lab2_ProfArqPackage.FILM__PSEUDONYM:
				setPseudonym(PSEUDONYM_EDEFAULT);
				return;
			case Lab2_ProfArqPackage.FILM__IMAGE:
				setImage(IMAGE_EDEFAULT);
				return;
			case Lab2_ProfArqPackage.FILM__DIRECTORS:
				getDirectors().clear();
				return;
			case Lab2_ProfArqPackage.FILM__GENRES:
				getGenres().clear();
				return;
			case Lab2_ProfArqPackage.FILM__COUNTRY:
				setCountry((Country)null);
				return;
			case Lab2_ProfArqPackage.FILM__CLASSIFICATION:
				setClassification((Classification)null);
				return;
			case Lab2_ProfArqPackage.FILM__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case Lab2_ProfArqPackage.FILM__RELEASE_DATE:
				setReleaseDate(RELEASE_DATE_EDEFAULT);
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
			case Lab2_ProfArqPackage.FILM__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Lab2_ProfArqPackage.FILM__SYNOPSIS:
				return SYNOPSIS_EDEFAULT == null ? synopsis != null : !SYNOPSIS_EDEFAULT.equals(synopsis);
			case Lab2_ProfArqPackage.FILM__PSEUDONYM:
				return PSEUDONYM_EDEFAULT == null ? pseudonym != null : !PSEUDONYM_EDEFAULT.equals(pseudonym);
			case Lab2_ProfArqPackage.FILM__IMAGE:
				return IMAGE_EDEFAULT == null ? image != null : !IMAGE_EDEFAULT.equals(image);
			case Lab2_ProfArqPackage.FILM__DIRECTORS:
				return directors != null && !directors.isEmpty();
			case Lab2_ProfArqPackage.FILM__GENRES:
				return genres != null && !genres.isEmpty();
			case Lab2_ProfArqPackage.FILM__COUNTRY:
				return country != null;
			case Lab2_ProfArqPackage.FILM__CLASSIFICATION:
				return classification != null;
			case Lab2_ProfArqPackage.FILM__DURATION:
				return duration != DURATION_EDEFAULT;
			case Lab2_ProfArqPackage.FILM__RELEASE_DATE:
				return RELEASE_DATE_EDEFAULT == null ? releaseDate != null : !RELEASE_DATE_EDEFAULT.equals(releaseDate);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", synopsis: ");
		result.append(synopsis);
		result.append(", pseudonym: ");
		result.append(pseudonym);
		result.append(", image: ");
		result.append(image);
		result.append(", duration: ");
		result.append(duration);
		result.append(", releaseDate: ");
		result.append(releaseDate);
		result.append(')');
		return result.toString();
	}

} //FilmImpl

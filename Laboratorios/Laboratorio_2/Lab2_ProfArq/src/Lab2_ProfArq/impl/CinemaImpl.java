/**
 */
package Lab2_ProfArq.impl;

import Lab2_ProfArq.AudioFormat;
import Lab2_ProfArq.Cinema;
import Lab2_ProfArq.City;
import Lab2_ProfArq.Classification;
import Lab2_ProfArq.Country;
import Lab2_ProfArq.Director;
import Lab2_ProfArq.Film;
import Lab2_ProfArq.Genre;
import Lab2_ProfArq.Lab2_ProfArqPackage;
import Lab2_ProfArq.Language;
import Lab2_ProfArq.Status;
import Lab2_ProfArq.VideoFormat;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cinema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Lab2_ProfArq.impl.CinemaImpl#getName <em>Name</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.CinemaImpl#getFlicks <em>Flicks</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.CinemaImpl#getManagers <em>Managers</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.CinemaImpl#getSorts <em>Sorts</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.CinemaImpl#getCountries <em>Countries</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.CinemaImpl#getClassifications <em>Classifications</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.CinemaImpl#getCities <em>Cities</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.CinemaImpl#getStatuses <em>Statuses</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.CinemaImpl#getVideoFormats <em>Video Formats</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.CinemaImpl#getAudioFormats <em>Audio Formats</em>}</li>
 *   <li>{@link Lab2_ProfArq.impl.CinemaImpl#getSpeeches <em>Speeches</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CinemaImpl extends MinimalEObjectImpl.Container implements Cinema {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFlicks() <em>Flicks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlicks()
	 * @generated
	 * @ordered
	 */
	protected EList<Film> flicks;

	/**
	 * The cached value of the '{@link #getManagers() <em>Managers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManagers()
	 * @generated
	 * @ordered
	 */
	protected EList<Director> managers;

	/**
	 * The cached value of the '{@link #getSorts() <em>Sorts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Genre> sorts;

	/**
	 * The cached value of the '{@link #getCountries() <em>Countries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountries()
	 * @generated
	 * @ordered
	 */
	protected EList<Country> countries;

	/**
	 * The cached value of the '{@link #getClassifications() <em>Classifications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Classification> classifications;

	/**
	 * The cached value of the '{@link #getCities() <em>Cities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCities()
	 * @generated
	 * @ordered
	 */
	protected EList<City> cities;

	/**
	 * The cached value of the '{@link #getStatuses() <em>Statuses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatuses()
	 * @generated
	 * @ordered
	 */
	protected EList<Status> statuses;

	/**
	 * The cached value of the '{@link #getVideoFormats() <em>Video Formats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideoFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<VideoFormat> videoFormats;

	/**
	 * The cached value of the '{@link #getAudioFormats() <em>Audio Formats</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAudioFormats()
	 * @generated
	 * @ordered
	 */
	protected EList<AudioFormat> audioFormats;

	/**
	 * The cached value of the '{@link #getSpeeches() <em>Speeches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeeches()
	 * @generated
	 * @ordered
	 */
	protected EList<Language> speeches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CinemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Lab2_ProfArqPackage.Literals.CINEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Lab2_ProfArqPackage.CINEMA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Film> getFlicks() {
		if (flicks == null) {
			flicks = new EObjectContainmentEList<Film>(Film.class, this, Lab2_ProfArqPackage.CINEMA__FLICKS);
		}
		return flicks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Director> getManagers() {
		if (managers == null) {
			managers = new EObjectContainmentEList<Director>(Director.class, this, Lab2_ProfArqPackage.CINEMA__MANAGERS);
		}
		return managers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Genre> getSorts() {
		if (sorts == null) {
			sorts = new EObjectContainmentEList<Genre>(Genre.class, this, Lab2_ProfArqPackage.CINEMA__SORTS);
		}
		return sorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Country> getCountries() {
		if (countries == null) {
			countries = new EObjectContainmentEList<Country>(Country.class, this, Lab2_ProfArqPackage.CINEMA__COUNTRIES);
		}
		return countries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classification> getClassifications() {
		if (classifications == null) {
			classifications = new EObjectContainmentEList<Classification>(Classification.class, this, Lab2_ProfArqPackage.CINEMA__CLASSIFICATIONS);
		}
		return classifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<City> getCities() {
		if (cities == null) {
			cities = new EObjectContainmentEList<City>(City.class, this, Lab2_ProfArqPackage.CINEMA__CITIES);
		}
		return cities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Status> getStatuses() {
		if (statuses == null) {
			statuses = new EObjectContainmentEList<Status>(Status.class, this, Lab2_ProfArqPackage.CINEMA__STATUSES);
		}
		return statuses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VideoFormat> getVideoFormats() {
		if (videoFormats == null) {
			videoFormats = new EObjectContainmentEList<VideoFormat>(VideoFormat.class, this, Lab2_ProfArqPackage.CINEMA__VIDEO_FORMATS);
		}
		return videoFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AudioFormat> getAudioFormats() {
		if (audioFormats == null) {
			audioFormats = new EObjectContainmentEList<AudioFormat>(AudioFormat.class, this, Lab2_ProfArqPackage.CINEMA__AUDIO_FORMATS);
		}
		return audioFormats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Language> getSpeeches() {
		if (speeches == null) {
			speeches = new EObjectContainmentEList<Language>(Language.class, this, Lab2_ProfArqPackage.CINEMA__SPEECHES);
		}
		return speeches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Lab2_ProfArqPackage.CINEMA__FLICKS:
				return ((InternalEList<?>)getFlicks()).basicRemove(otherEnd, msgs);
			case Lab2_ProfArqPackage.CINEMA__MANAGERS:
				return ((InternalEList<?>)getManagers()).basicRemove(otherEnd, msgs);
			case Lab2_ProfArqPackage.CINEMA__SORTS:
				return ((InternalEList<?>)getSorts()).basicRemove(otherEnd, msgs);
			case Lab2_ProfArqPackage.CINEMA__COUNTRIES:
				return ((InternalEList<?>)getCountries()).basicRemove(otherEnd, msgs);
			case Lab2_ProfArqPackage.CINEMA__CLASSIFICATIONS:
				return ((InternalEList<?>)getClassifications()).basicRemove(otherEnd, msgs);
			case Lab2_ProfArqPackage.CINEMA__CITIES:
				return ((InternalEList<?>)getCities()).basicRemove(otherEnd, msgs);
			case Lab2_ProfArqPackage.CINEMA__STATUSES:
				return ((InternalEList<?>)getStatuses()).basicRemove(otherEnd, msgs);
			case Lab2_ProfArqPackage.CINEMA__VIDEO_FORMATS:
				return ((InternalEList<?>)getVideoFormats()).basicRemove(otherEnd, msgs);
			case Lab2_ProfArqPackage.CINEMA__AUDIO_FORMATS:
				return ((InternalEList<?>)getAudioFormats()).basicRemove(otherEnd, msgs);
			case Lab2_ProfArqPackage.CINEMA__SPEECHES:
				return ((InternalEList<?>)getSpeeches()).basicRemove(otherEnd, msgs);
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
			case Lab2_ProfArqPackage.CINEMA__NAME:
				return getName();
			case Lab2_ProfArqPackage.CINEMA__FLICKS:
				return getFlicks();
			case Lab2_ProfArqPackage.CINEMA__MANAGERS:
				return getManagers();
			case Lab2_ProfArqPackage.CINEMA__SORTS:
				return getSorts();
			case Lab2_ProfArqPackage.CINEMA__COUNTRIES:
				return getCountries();
			case Lab2_ProfArqPackage.CINEMA__CLASSIFICATIONS:
				return getClassifications();
			case Lab2_ProfArqPackage.CINEMA__CITIES:
				return getCities();
			case Lab2_ProfArqPackage.CINEMA__STATUSES:
				return getStatuses();
			case Lab2_ProfArqPackage.CINEMA__VIDEO_FORMATS:
				return getVideoFormats();
			case Lab2_ProfArqPackage.CINEMA__AUDIO_FORMATS:
				return getAudioFormats();
			case Lab2_ProfArqPackage.CINEMA__SPEECHES:
				return getSpeeches();
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
			case Lab2_ProfArqPackage.CINEMA__NAME:
				setName((String)newValue);
				return;
			case Lab2_ProfArqPackage.CINEMA__FLICKS:
				getFlicks().clear();
				getFlicks().addAll((Collection<? extends Film>)newValue);
				return;
			case Lab2_ProfArqPackage.CINEMA__MANAGERS:
				getManagers().clear();
				getManagers().addAll((Collection<? extends Director>)newValue);
				return;
			case Lab2_ProfArqPackage.CINEMA__SORTS:
				getSorts().clear();
				getSorts().addAll((Collection<? extends Genre>)newValue);
				return;
			case Lab2_ProfArqPackage.CINEMA__COUNTRIES:
				getCountries().clear();
				getCountries().addAll((Collection<? extends Country>)newValue);
				return;
			case Lab2_ProfArqPackage.CINEMA__CLASSIFICATIONS:
				getClassifications().clear();
				getClassifications().addAll((Collection<? extends Classification>)newValue);
				return;
			case Lab2_ProfArqPackage.CINEMA__CITIES:
				getCities().clear();
				getCities().addAll((Collection<? extends City>)newValue);
				return;
			case Lab2_ProfArqPackage.CINEMA__STATUSES:
				getStatuses().clear();
				getStatuses().addAll((Collection<? extends Status>)newValue);
				return;
			case Lab2_ProfArqPackage.CINEMA__VIDEO_FORMATS:
				getVideoFormats().clear();
				getVideoFormats().addAll((Collection<? extends VideoFormat>)newValue);
				return;
			case Lab2_ProfArqPackage.CINEMA__AUDIO_FORMATS:
				getAudioFormats().clear();
				getAudioFormats().addAll((Collection<? extends AudioFormat>)newValue);
				return;
			case Lab2_ProfArqPackage.CINEMA__SPEECHES:
				getSpeeches().clear();
				getSpeeches().addAll((Collection<? extends Language>)newValue);
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
			case Lab2_ProfArqPackage.CINEMA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Lab2_ProfArqPackage.CINEMA__FLICKS:
				getFlicks().clear();
				return;
			case Lab2_ProfArqPackage.CINEMA__MANAGERS:
				getManagers().clear();
				return;
			case Lab2_ProfArqPackage.CINEMA__SORTS:
				getSorts().clear();
				return;
			case Lab2_ProfArqPackage.CINEMA__COUNTRIES:
				getCountries().clear();
				return;
			case Lab2_ProfArqPackage.CINEMA__CLASSIFICATIONS:
				getClassifications().clear();
				return;
			case Lab2_ProfArqPackage.CINEMA__CITIES:
				getCities().clear();
				return;
			case Lab2_ProfArqPackage.CINEMA__STATUSES:
				getStatuses().clear();
				return;
			case Lab2_ProfArqPackage.CINEMA__VIDEO_FORMATS:
				getVideoFormats().clear();
				return;
			case Lab2_ProfArqPackage.CINEMA__AUDIO_FORMATS:
				getAudioFormats().clear();
				return;
			case Lab2_ProfArqPackage.CINEMA__SPEECHES:
				getSpeeches().clear();
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
			case Lab2_ProfArqPackage.CINEMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Lab2_ProfArqPackage.CINEMA__FLICKS:
				return flicks != null && !flicks.isEmpty();
			case Lab2_ProfArqPackage.CINEMA__MANAGERS:
				return managers != null && !managers.isEmpty();
			case Lab2_ProfArqPackage.CINEMA__SORTS:
				return sorts != null && !sorts.isEmpty();
			case Lab2_ProfArqPackage.CINEMA__COUNTRIES:
				return countries != null && !countries.isEmpty();
			case Lab2_ProfArqPackage.CINEMA__CLASSIFICATIONS:
				return classifications != null && !classifications.isEmpty();
			case Lab2_ProfArqPackage.CINEMA__CITIES:
				return cities != null && !cities.isEmpty();
			case Lab2_ProfArqPackage.CINEMA__STATUSES:
				return statuses != null && !statuses.isEmpty();
			case Lab2_ProfArqPackage.CINEMA__VIDEO_FORMATS:
				return videoFormats != null && !videoFormats.isEmpty();
			case Lab2_ProfArqPackage.CINEMA__AUDIO_FORMATS:
				return audioFormats != null && !audioFormats.isEmpty();
			case Lab2_ProfArqPackage.CINEMA__SPEECHES:
				return speeches != null && !speeches.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CinemaImpl

/**
 */
package Lab2_ProfArq.provider;


import Lab2_ProfArq.Cinema;
import Lab2_ProfArq.Lab2_ProfArqFactory;
import Lab2_ProfArq.Lab2_ProfArqPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Lab2_ProfArq.Cinema} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CinemaItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CinemaItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Cinema_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Cinema_name_feature", "_UI_Cinema_type"),
				 Lab2_ProfArqPackage.Literals.CINEMA__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Lab2_ProfArqPackage.Literals.CINEMA__FLICKS);
			childrenFeatures.add(Lab2_ProfArqPackage.Literals.CINEMA__MANAGERS);
			childrenFeatures.add(Lab2_ProfArqPackage.Literals.CINEMA__SORTS);
			childrenFeatures.add(Lab2_ProfArqPackage.Literals.CINEMA__COUNTRIES);
			childrenFeatures.add(Lab2_ProfArqPackage.Literals.CINEMA__CLASSIFICATIONS);
			childrenFeatures.add(Lab2_ProfArqPackage.Literals.CINEMA__CITIES);
			childrenFeatures.add(Lab2_ProfArqPackage.Literals.CINEMA__STATUSES);
			childrenFeatures.add(Lab2_ProfArqPackage.Literals.CINEMA__VIDEO_FORMATS);
			childrenFeatures.add(Lab2_ProfArqPackage.Literals.CINEMA__AUDIO_FORMATS);
			childrenFeatures.add(Lab2_ProfArqPackage.Literals.CINEMA__SPEECHES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Cinema.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Cinema"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Cinema)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Cinema_type") :
			getString("_UI_Cinema_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Cinema.class)) {
			case Lab2_ProfArqPackage.CINEMA__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case Lab2_ProfArqPackage.CINEMA__FLICKS:
			case Lab2_ProfArqPackage.CINEMA__MANAGERS:
			case Lab2_ProfArqPackage.CINEMA__SORTS:
			case Lab2_ProfArqPackage.CINEMA__COUNTRIES:
			case Lab2_ProfArqPackage.CINEMA__CLASSIFICATIONS:
			case Lab2_ProfArqPackage.CINEMA__CITIES:
			case Lab2_ProfArqPackage.CINEMA__STATUSES:
			case Lab2_ProfArqPackage.CINEMA__VIDEO_FORMATS:
			case Lab2_ProfArqPackage.CINEMA__AUDIO_FORMATS:
			case Lab2_ProfArqPackage.CINEMA__SPEECHES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(Lab2_ProfArqPackage.Literals.CINEMA__FLICKS,
				 Lab2_ProfArqFactory.eINSTANCE.createFilm()));

		newChildDescriptors.add
			(createChildParameter
				(Lab2_ProfArqPackage.Literals.CINEMA__MANAGERS,
				 Lab2_ProfArqFactory.eINSTANCE.createDirector()));

		newChildDescriptors.add
			(createChildParameter
				(Lab2_ProfArqPackage.Literals.CINEMA__SORTS,
				 Lab2_ProfArqFactory.eINSTANCE.createGenre()));

		newChildDescriptors.add
			(createChildParameter
				(Lab2_ProfArqPackage.Literals.CINEMA__COUNTRIES,
				 Lab2_ProfArqFactory.eINSTANCE.createCountry()));

		newChildDescriptors.add
			(createChildParameter
				(Lab2_ProfArqPackage.Literals.CINEMA__CLASSIFICATIONS,
				 Lab2_ProfArqFactory.eINSTANCE.createClassification()));

		newChildDescriptors.add
			(createChildParameter
				(Lab2_ProfArqPackage.Literals.CINEMA__CITIES,
				 Lab2_ProfArqFactory.eINSTANCE.createCity()));

		newChildDescriptors.add
			(createChildParameter
				(Lab2_ProfArqPackage.Literals.CINEMA__STATUSES,
				 Lab2_ProfArqFactory.eINSTANCE.createStatus()));

		newChildDescriptors.add
			(createChildParameter
				(Lab2_ProfArqPackage.Literals.CINEMA__VIDEO_FORMATS,
				 Lab2_ProfArqFactory.eINSTANCE.createVideoFormat()));

		newChildDescriptors.add
			(createChildParameter
				(Lab2_ProfArqPackage.Literals.CINEMA__AUDIO_FORMATS,
				 Lab2_ProfArqFactory.eINSTANCE.createAudioFormat()));

		newChildDescriptors.add
			(createChildParameter
				(Lab2_ProfArqPackage.Literals.CINEMA__SPEECHES,
				 Lab2_ProfArqFactory.eINSTANCE.createLanguage()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Lab2_ProfArqEditPlugin.INSTANCE;
	}

}

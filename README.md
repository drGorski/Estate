# Estate

The software package for house and apartment sales offers.

## The package structure

The software structure includes three packages: view, controller, and model.

The view package consists of one class: ``Main``.

The controller package encompasses one class: ``OfferList``.

The model package comprises three classes:
* ``Estate`` class --- the abstract class that represents the generic real estate.
* ``House`` class --- a specific class that represents an offer to sell a house.
* ``Apartment`` class --- a concrete class that represents an offer to sell an apartment.

## Package functions in UML Use Case diagram

The figure below presents the UML Use Case diagram with use cases of the Estate package.
<p align="center">
  <img src="Estate-use-case-diagram.png" alt="UML Use Case diagram" width="400">
</p>

## Package structure in UML Class diagram

The figure below presents the UML Class diagram with classes and relationships of the Estate package.
<p align="center">
  <img src="Estate-class-diagram.png" alt="UML Use Case diagram" width="600">
</p>

## Package operation in UML Sequence diagrams

The figure below presents the UML Sequence diagram for invocation of the ``addSellHouseOffer()`` method. The method corresponds to the ``Add a house for sale`` use case.
<p align="center">
  <img src="Estate-sequence-1.png" alt="UML Use Case diagram" width="600">
</p>

The figure below presents the UML Sequence diagram for invocation of the ``addSellHouseOffer()`` method. The method corresponds to the ``Add a house for sale`` use case.
<p align="center">
  <img src="Estate-sequence-2.png" alt="UML Use Case diagram" width="600">
</p>


## Running test suites

The ``RunTestSuite`` class should be run to execute predefined test suites for two example smart contracts. 

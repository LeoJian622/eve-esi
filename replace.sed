# Objects
# jq '.paths[].get.responses["200"].schema.properties[]? | select(.type == "object") | .title' esi.json | grep -v null | sort | sed -e 's#"##g' -e 's#^#s/#' -e 's#$#//g#'
s/get_characters_character_id_clones_home_location/CloneHomeLocation/g
s/get_fw_leaderboards_characters_kills/FactionWarfareLeaderboardCharacterKills/g
s/get_fw_leaderboards_characters_victory_points/FactionWarfareLeaderboardCharacterVictoryPoints/g
s/get_fw_leaderboards_corporations_kills/FactionWarfareLeaderboardCorporationsKills/g
s/get_fw_leaderboards_corporations_victory_points/FactionWarfareLeaderboardCorporationsVictoryPoints/g
s/get_fw_leaderboards_kills/FactionWarfareLeaderboardKills/g
s/get_fw_leaderboards_victory_points/FactionWarfareLeaderboardVictoryPoints/g
s/get_killmails_killmail_id_killmail_hash_victim/KillmailVictim/g
s/get_universe_stargates_stargate_id_destination/StargateDestination/g
s/get_wars_war_id_aggressor/Aggressor/g
s/get_wars_war_id_defender/Defender/g

# Objects in Arrays
# jq '.paths[].get.responses["200"].schema.properties[]? | select(.type == "array") | .items | select(.type == "object") | .title' esi.json | grep -v null | sort | sed -e 's#"##g' -e 's#^#s/#' -e 's#$#//g#'
s/get_characters_character_id_clones_jump_clone/Clone/g
s/get_characters_character_id_mail_labels_label/MailLabel/g
s/get_characters_character_id_planets_planet_id_link/PlanetLink/g
s/get_characters_character_id_planets_planet_id_pin/PlanetPin/g
s/get_characters_character_id_planets_planet_id_route/PlanetRoute/g
s/get_characters_character_id_skills_skill/Skill/g
s/get_dogma_effects_effect_id_modifier/DogmaEffectModifier/g
s/get_killmails_killmail_id_killmail_hash_attacker/KillmailAttacker/g
s/get_universe_systems_system_id_planet/SystemPlanet/g
s/get_universe_types_type_id_dogma_attribute/TypeDogmaAttribute/g
s/get_universe_types_type_id_dogma_effect/TypeDogmaEffect/g
s/get_wars_war_id_ally/WarAlly/g

# Inner Objects
# jq '.paths[].get.responses["200"].schema.items.properties[]? | select(.type == "object") | .title' esi.json | sort | sed -e 's#"##g' -e 's#^#s/#' -e 's#$#//g#'
s/get_characters_character_id_bookmarks_target/BookmarkTarget/g
s/get_corporations_corporation_id_alliancehistory_alliance/Alliance/g
s/get_fw_stats_kills/FactionWarfareStatsKills/g
s/get_fw_stats_victory_points/FactionWarfareStatsVictoryPoints/g

# jq '.paths[].get.responses["200"].schema.items.properties[]? | select(.properties != null).properties[] | select(.type == "object").title' esi.json | sort | sed -e 's#"##g' -e 's#^#s/#' -e 's#$#//g#'
s/get_characters_character_id_bookmarks_item/CharacterBookmarkItem/g

# Objects in post/put
# jq '.paths[][].parameters[].schema.title' esi.json | grep -v null | sort | sed -e 's#"##g' -e 's#^#s/#' -e 's#$#//g#'
s/post_characters_character_id_cspa_characters/CspaCharacters/g
s/post_characters_character_id_fittings_fitting/CharacterFitting/g
s/post_characters_character_id_mail_labels_label/MailLabelSimple/g
s/post_characters_character_id_mail_mail/Mail/g
s/post_fleets_fleet_id_members_invitation/FleetInvitation/g
s/post_universe_names_ids/EntityIds/g
s/put_characters_character_id_mail_mail_id_contents/MailMetaData/g
s/put_corporations_corporation_id_structures_structure_id_new_schedule/StructureSchedule/g
s/put_fleets_fleet_id_members_member_id_movement/FleetMemberMovement/g
s/put_fleets_fleet_id_new_settings/FleetNewSettings/g
s/put_fleets_fleet_id_squads_squad_id_naming/FleetSquadNaming/g
s/put_fleets_fleet_id_wings_wing_id_naming/FleetWingNaming/g
s/put_characters_character_id_calendar_event_id_response/CharacterCalendarEvent/g


# Other objects
s/get_characters_character_id_chat_channels_allowed/ChatChannelsAllowed/g
s/get_characters_character_id_chat_channels_blocked/ChatChannelsBlocked/g
s/get_characters_character_id_chat_channels_muted/ChatChannelsMuted/g
s/get_characters_character_id_chat_channels_operator/ChatChannelsOperator/g
s/get_characters_character_id_medals_graphic/CharacterMedalsGraphic/g
s/get_characters_character_id_planets_planet_id_content/PlanetContent/g
s/get_characters_character_id_planets_planet_id_extractor_details/PlanetExtractorDetails/g
s/get_characters_character_id_planets_planet_id_factory_details/PlanetFactoryDetails/g
s/get_characters_character_id_planets_planet_id_head/PlanetHead/g
s/get_characters_character_id_planets_planet_id_waypoint/PlanetWaypoint/g
s/get_corporations_corporation_id_structures_service/StructureService/g
s/get_fleets_fleet_id_wings_squad/Squad/g
s/get_fw_leaderboards_characters_active_total/FactionWarfareLeaderboardCharactersActiveTotalVictoryPoints/g3
s/get_fw_leaderboards_characters_active_total/FactionWarfareLeaderboardCharactersActiveTotalKills/
s/get_fw_leaderboards_characters_last_week/FactionWarfareLeaderboardCharactersLastWeekVictoryPoints/g3
s/get_fw_leaderboards_characters_last_week/FactionWarfareLeaderboardCharactersLastWeekKills/
s/get_fw_leaderboards_characters_yesterday/FactionWarfareLeaderboardCharactersYesterdayVictoryPoints/g3
s/get_fw_leaderboards_characters_yesterday/FactionWarfareLeaderboardCharactersYesterdayKills/
s/get_fw_leaderboards_corporations_active_total/FactionWarfareLeaderboardCorporationActiveTotalVictoryPoints/g3
s/get_fw_leaderboards_corporations_active_total/FactionWarfareLeaderboardCorporationActiveTotalKills/
s/get_fw_leaderboards_corporations_last_week/FactionWarfareLeaderboardCorporationLastWeekVictoryPoints/g3
s/get_fw_leaderboards_corporations_last_week/FactionWarfareLeaderboardCorporationLastWeekKills/
s/get_fw_leaderboards_corporations_yesterday/FactionWarfareLeaderboardCorporationYesterdayVictoryPoints/g3
s/get_fw_leaderboards_corporations_yesterday/FactionWarfareLeaderboardCorporationYesterdayKills/
s/get_fw_leaderboards_active_total/FactionWarfareLeaderboardActiveTotalVictoryPoints/g3
s/get_fw_leaderboards_active_total/FactionWarfareLeaderboardActiveTotalKills/
s/get_fw_leaderboards_last_week/FactionWarfareLeaderboardLastWeekVictoryPoints/g3
s/get_fw_leaderboards_last_week/FactionWarfareLeaderboardLastWeekKills/
s/get_fw_leaderboards_yesterday/FactionWarfareLeaderboardYesterdayVictoryPoints/g3
s/get_fw_leaderboards_yesterday/FactionWarfareLeaderboardYesterdayKills/
s/get_industry_systems_cost_indice/SystemCostIndice/g
s/get_insurance_prices_level/InsurancePriceLevel/g
s/get_loyalty_stores_corporation_id_offers_required_item/RequiredItem/g
s/get_sovereignty_campaigns_participant/SovereigntyCampaignParticipant/g
s/post_ui_openwindow_newmail_new_mail/UiNewMail/g

# Post 200
# jq '.paths[].post.responses["200"].schema.items.title' esi.json | grep -v null | sort | sed -e 's#"##g' -e 's#^#s/#' -e 's#$#//g#'
s/post_characters_affiliation_200_ok/CharacterAffiliationResponse/g
s/post_universe_names_200_ok/UniverseNamesResponse/g

# Post 201
# jq '.paths[].post.responses["201"].schema.title' esi.json | grep -v null | sort | sed -e 's#"##g' -e 's#^#s/#' -e 's#$#//g#'
s/post_characters_character_id_contacts_created/AddContactsResponse/g
s/post_characters_character_id_cspa_created/CspaCostResponse/g
s/post_characters_character_id_fittings_created/CharacterFittingResponse/g
s/post_characters_character_id_mail_created/SendMailResponse/g
s/post_characters_character_id_mail_labels_created/CreateMailLabelResponse/g
s/post_fleets_fleet_id_wings_created/FleetWingCreatedResponse/g
s/post_fleets_fleet_id_wings_wing_id_squads_created/FleetSquadCreatedResponse/g

# Responses Objects
# jq '.paths[].get.responses["200"].schema.items.title' esi.json | grep -v null | sort | sed -e 's#"##g' -e 's#^#s/#' -e 's#$#//g#'
s/get_alliances_alliance_id_corporations_200_ok/AllianceCorporationsResponse/g
s/get_alliances_alliance_id_ok/AllianceResponse/g
s/get_alliances_names_200_ok/AllianceNamesResponse/g
s/get_characters_character_id_agents_research_200_ok/CharacterResearchAgentsResponse/g
s/get_characters_character_id_assets_200_ok/CharacterAssetsResponse/g
s/get_characters_character_id_blueprints_200_ok/CharacterBlueprintsResponse/g
s/get_characters_character_id_bookmarks_200_ok/CharacterBookmarksResponse/g
s/get_characters_character_id_bookmarks_folders_200_ok/CharacterBookmarkFoldersResponse/g
s/get_characters_character_id_calendar_200_ok/CharacterCalendarResponse/g
s/get_characters_character_id_chat_channels_200_ok/CharacterChatChannelsResponse/g
s/get_characters_character_id_contacts_200_ok/ContactsResponse/g
s/get_characters_character_id_contacts_labels_200_ok/ContactLabelsResponse/g
s/get_characters_character_id_corporationhistory_200_ok/CharacterCorporationHistoryResponse/g
s/get_characters_character_id_fittings_200_ok/CharacterFittingsResponse/g
s/get_characters_character_id_implants_200_ok/CharacterImplantsResponse/g
s/get_characters_character_id_industry_jobs_200_ok/CharacterIndustryJobsResponse/g
s/get_characters_character_id_killmails_recent_200_ok/CharacterKillmailsResponse/g
s/get_characters_character_id_loyalty_points_200_ok/CharacterLoyaltyPointsResponse/g
s/get_characters_character_id_mail_200_ok/MailHeadersResponse/g
s/get_characters_character_id_mail_lists_200_ok/CharacterMailinglistsResponse/g
s/get_characters_character_id_medals_200_ok/CharacterMedalsResponse/g
s/get_characters_character_id_notifications_contacts_200_ok/NewContactNotificationsResponse/g
s/get_characters_character_id_opportunities_200_ok/CharacterOpportunitiesResponse/g
s/get_characters_character_id_orders_200_ok/CharacterOrdersResponse/g
s/get_characters_character_id_planets_200_ok/CharacterPlanetsResponse/g
s/get_characters_character_id_roles_200_ok/CharacterRolesResponse/g
s/get_characters_character_id_skillqueue_200_ok/CharacterSkillqueueResponse/g
s/get_characters_character_id_standings_200_ok/CharacterStandingsResponse/g
s/get_characters_character_id_wallets_200_ok/CharacterWalletsResponse/g
s/get_characters_character_id_wallets_journal_200_ok/CharacterWalletsJournalResponse/g
s/get_characters_character_id_wallets_transactions_200_ok/CharacterWalletsTransactionsResponse/g
s/get_characters_character_id_wallet_journal_200_ok/CharacterWalletJournalResponse/g
s/get_characters_character_id_wallet_transactions_200_ok/CharacterWalletTransactionsResponse/g
s/get_characters_character_id_contracts_200_ok/CharacterContractsResponse/g
s/get_characters_character_id_contracts_contract_id_bids_200_ok/CharacterContractsBidsResponse/g
s/get_characters_character_id_contracts_contract_id_items_200_ok/CharacterContractsItemsResponse/g
s/get_characters_character_id_wallet_journal_extra_info/CharacterWalletJournalExtraInfoResponse/g
s/get_characters_character_id_attributes_ok/CharacterAttributesResponse/g
s/get_characters_character_id_fatigue_ok/CharacterFatigueResponse/g
s/get_characters_names_200_ok/CharacterNamesResponse/g
s/get_corporations_corporation_id_alliancehistory_200_ok/CorporationAlliancesHistoryResponse/g
s/get_corporations_corporation_id_members_200_ok/CorporationMembersResponse/g
s/get_corporations_corporation_id_membertracking_200_ok/CorporationMemberTrackingResponse/g
s/get_corporations_corporation_id_roles_200_ok/CorporationRolesResponse/g
s/get_corporations_corporation_id_structures_200_ok/CorporationStructuresResponse/g
s/get_corporations_corporation_id_wallets_200_ok/CorporationWalletsResponse/g
s/get_corporations_corporation_id_wallets_division_journal_extra_info/CorporationWalletJournalExtraInfoResponse/g
s/get_corporations_corporation_id_wallets_division_journal_200_ok/CorporationWalletJournalResponse/g
s/get_corporations_corporation_id_killmails_recent_200_ok/CorporationKillmailsResponse/g
s/get_corporations_names_200_ok/CorporationNamesResponse/g
s/get_corporations_npccorps_200_ok/NpcCorporationsResponse/g
s/get_dogma_attributes_200_ok/DogmaAttributesResponse/g
s/get_dogma_effects_200_ok/DogmaEffectsResponse/g
s/get_fleets_fleet_id_members_200_ok/FleetMembersResponse/g
s/get_fleets_fleet_id_wings_200_ok/FleetWingsResponse/g
s/get_fw_stats_200_ok/FactionWarfareStatsResponse/g
s/get_fw_systems_200_ok/FactionWarfareSystemsResponse/g
s/get_fw_wars_200_ok/FactionWarfareWarsResponse/g
s/get_incursions_200_ok/IncursionsResponse/g
s/get_industry_facilities_200_ok/IndustryFacilitiesResponse/g
s/get_industry_systems_200_ok/IndustrySystemsResponse/g
s/get_insurance_prices_200_ok/InsurancePricesResponse/g
s/get_loyalty_stores_corporation_id_offers_200_ok/LoyaltyStoreOffersResponse/g
s/get_markets_groups_200_ok/MarketGroupsResponse/g
s/get_markets_prices_200_ok/MarketPricesResponse/g
s/get_markets_region_id_history_200_ok/MarketHistoryResponse/g
s/get_markets_region_id_orders_200_ok/MarketOrdersResponse/g
s/get_markets_structures_structure_id_200_ok/MarketStructuresResponse/g
s/get_opportunities_groups_200_ok/OpportunitiesGroupsResponse/g
s/get_opportunities_tasks_200_ok/OpportunitiesTasksResponse/g
s/get_sovereignty_campaigns_200_ok/SovereigntyCampaignsResponse/g
s/get_sovereignty_map_200_ok/SovereigntyMapResponse/g
s/get_sovereignty_structures_200_ok/SovereigntyStructuresResponse/g
s/get_universe_bloodlines_200_ok/BloodlinesResponse/g
s/get_universe_categories_200_ok/CategoriesResponse/g
s/get_universe_constellations_200_ok/ConstellationsResponse/g
s/get_universe_factions_200_ok/FactionsResponse/g
s/get_universe_graphics_200_ok/GraphicsResponse/g
s/get_universe_groups_200_ok/GroupsResponse/g
s/get_universe_races_200_ok/RacesResponse/g
s/get_universe_regions_200_ok/RegionsResponse/g
s/get_universe_structures_200_ok/StructuresResponse/g
s/get_universe_system_jumps_200_ok/SystemJumpsResponse/g
s/get_universe_system_kills_200_ok/SystemKillsResponse/g
s/get_universe_systems_200_ok/SystemsResponse/g
s/get_universe_types_200_ok/TypesResponse/g
s/get_wars_200_ok/WarsResponse/g
s/get_wars_war_id_killmails_200_ok/WarKillmailsResponse/g
s/get_characters_character_id_notifications_200_ok/CharacterNotificationsResponse/g
s/get_corporations_corporation_id_assets_200_ok/CorporationAssetsResponse/g
s/get_corporations_corporation_id_contacts_200_ok/CorporationContactsResponse/g
s/get_corporations_corporation_id_divisions_hangar/CorporationDivisionsHangar/g
s/get_corporations_corporation_id_divisions_ok/CorporationDivisionsResponse/g
s/get_corporations_corporation_id_divisions_wallet/CorporationDivisionsWallet/g
s/get_corporations_corporation_id_wallets_division_transactions_200_ok/CorporationWalletTransactionsResponse/g
s/get_characters_character_id_calendar_event_id_attendees_200_ok/CharacterCalendarAttendeesResponse/g
s/get_corporations_corporation_id_blueprints_200_ok/CorporationBlueprintsResponse/g
s/get_corporations_corporation_id_titles_200_ok/CorporationTitlesResponse/g
s/post_characters_character_id_assets_locations_200_ok/CharacterAssetsLocationsResponse/g
s/post_characters_character_id_assets_names_200_ok/CharacterAssetsNamesResponse/g
s/get_corporations_corporation_id_bookmarks_200_ok/CorporationBookmarksResponse/g
s/get_corporations_corporation_id_bookmarks_coordinates/CorporationBookmarksCoordinates/g
s/get_corporations_corporation_id_bookmarks_folders_200_ok/CorporationBookmarkFoldersResponse/g
s/get_corporations_corporation_id_bookmarks_item/CorporationBookmarkItem/g
s/get_corporations_corporation_id_contracts_200_ok/CorporationContractsResponse/g
s/get_corporations_corporation_id_contracts_contract_id_bids_200_ok/CorporationContractsBidsResponse/g
s/get_corporations_corporation_id_contracts_contract_id_items_200_ok/CorporationContractsItemsResponse/g
s/get_corporations_corporation_id_industry_jobs_200_ok/CorporationIndustryJobsResponse/g
s/get_corporations_corporation_id_orders_200_ok/CorporationOrdersResponse/g
s/get_corporations_corporation_id_standings_200_ok/CorporationStandingsResponse/g
s/post_corporations_corporation_id_assets_locations_200_ok/CorporationAssetsLocationsResponse/g
s/post_corporations_corporation_id_assets_names_200_ok/CorporationAssetsNamesResponse/g
s/get_characters_character_id_fleet_ok/CharacterFleetResponse/g
s/get_corporations_corporation_id_containers_logs_200_ok/CorporationContainersLogsResponse/g
s/get_corporations_corporation_id_shareholders_200_ok/CorporationShareholdersResponse/g
s/get_characters_character_id_mining_200_ok/CharacterMiningResponse/g
s/get_corporation_corporation_id_mining_extractions_200_ok/CorporationMiningExtractionsResponse/g
s/get_corporation_corporation_id_mining_observers_200_ok/CorporationMiningObserversResponse/g
s/get_corporation_corporation_id_mining_observers_observer_id_200_ok/CorporationMiningObserverResponse/g

# Responses Array
# jq '.paths[].get.responses["200"].schema | select(.type != "array") | .title' esi.json | grep -v null | sort | sed -e 's#"##g' -e 's#^#s/#' -e 's#$#//g#'
s/get_alliances_200_ok/AlliancesResponse/g
s/get_alliances_alliance_id_icons_ok/AllianceIconsResponse/g
s/get_characters_character_id_calendar_event_id_ok/CharacterCalendarEventResponse/g
s/get_characters_character_id_clones_ok/CharacterClonesResponse/g
s/get_characters_character_id_location_ok/CharacterLocationResponse/g
s/get_characters_character_id_mail_labels_ok/MailLabelsResponse/g
s/get_characters_character_id_mail_mail_id_ok/MailResponse/g
s/get_characters_character_id_ok/CharacterResponse/g
s/get_characters_character_id_online_ok/CharacterOnlineResponse/g
s/get_characters_character_id_planets_planet_id_ok/CharacterPlanetResponse/g
s/get_characters_character_id_portrait_ok/CharacterPortraitResponse/g
s/get_characters_character_id_search_ok/CharacterSearchResponse/g
s/get_characters_character_id_ship_ok/CharacterShipResponse/g
s/get_characters_character_id_skills_ok/CharacterSkillsResponse/g
s/get_characters_character_id_wallet_ok/CharacterWalletResponse/g
s/get_corporations_corporation_id_icons_ok/CorporationIconsResponse/g
s/get_corporations_corporation_id_ok/CorporationResponse/g
s/get_dogma_attributes_attribute_id_ok/DogmaAttributeResponse/g
s/get_dogma_effects_effect_id_ok/DogmaEffectResponse/g
s/get_fleets_fleet_id_ok/FleetResponse/g
s/get_fw_leaderboards_characters_ok/FactionWarfareLeaderboardCharactersResponse/g
s/get_fw_leaderboards_corporations_ok/FactionWarfareLeaderboardCorporationsResponse/g
s/get_fw_leaderboards_ok/FactionWarfareLeaderboardResponse/g
s/get_killmails_killmail_id_killmail_hash_ok/KillmailResponse/g
s/get_markets_groups_market_group_id_ok/MarketGroupResponse/g
s/get_opportunities_groups_group_id_ok/OpportunitiesGroupResponse/g
s/get_opportunities_tasks_task_id_ok/OpportunitiesTasksResponse/g
s/get_search_ok/SearchResponse/g
s/get_status_ok/StatusResponse/g
s/get_universe_categories_category_id_ok/CategoryResponse/g
s/get_universe_constellations_constellation_id_ok/ConstellationResponse/g
s/get_universe_graphics_graphic_id_ok/GraphicResponse/g
s/get_universe_groups_group_id_ok/GroupResponse/g
s/get_universe_moons_moon_id_ok/MoonResponse/g
s/get_universe_planets_planet_id_ok/PlanetResponse/g
s/get_universe_regions_region_id_ok/RegionResponse/g
s/get_universe_schematics_schematic_id_ok/PlanetFactorySchematicResponse/g
s/get_universe_stargates_stargate_id_ok/StargateResponse/g
s/get_universe_stars_star_id_ok/StarResponse/g
s/get_universe_stations_station_id_ok/StationResponse/g
s/get_universe_structures_structure_id_ok/StructureResponse/g
s/get_universe_systems_system_id_ok/SystemResponse/g
s/get_universe_types_type_id_ok/TypeResponse/g
s/get_wars_war_id_ok/WarResponse/g
